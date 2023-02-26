--
-- Dumping data for table `user`
--
INSERT INTO `user` (`id`, `email`, `username`, `roles`, `password`) VALUES
   (1, 'pedro@gmail.com', 'Pedrone', 'ROLE_USER', '$2a$10$ziEQLVDdCPAEqhjZDMCrAu3/WIRI56Uz0q47Vd.z2qpHokvZgotTK'),
   (2, 'dario@gmail.com', 'Dario', 'ROLE_USER,ROLE_ADMIN', '$2a$10$ziEQLVDdCPAEqhjZDMCrAu3/WIRI56Uz0q47Vd.z2qpHokvZgotTK'),
   (3, 'emi@gmail.com', 'Cacuuunn', 'ROLE_USER', '$2a$10$ziEQLVDdCPAEqhjZDMCrAu3/WIRI56Uz0q47Vd.z2qpHokvZgotTK');

-- Dumping data for table `user_seq`
--

INSERT INTO `user_seq` (`next_val`) VALUES
    (53);

--
-- Dumping data for table `orders`
--
INSERT INTO `orders` (`id`, `text`) VALUES
                                      (1, 'llamar a tahio'),
                                      (2, 'estudiar programacion'),
                                      (3, 'pegarle al perro en la nuca');

-- Dumping data for table `orders_seq`
--

INSERT INTO `orders_seq` (`next_val`) VALUES
    (53);