--
-- Dumping data for table `user`
--
INSERT INTO `user` (`id`, `email`, `firstname`, `role`, `password`) VALUES
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
INSERT INTO `orders` (`id`, `text`, `deliveryDate`, `origin`, `state`, `delivery`, `destination`, `recibes`, `phoneRecibes`, `bundle`, `missing`, `observations`, `deliveryObservations`, `logistic`, `usersId`) VALUES
    (21, 'llamar a tahio', '2021-08-10', 'Blv Calle 123', 'frenado', 'Carlos Sanchez', 'destination', 'recibes', 1111, 'bundle', 'sdsds', 'observations', 'asdasdasd', ' xfbxfbd', 4),
    (22, 'llamar a tahio', '2021-08-10', 'Blv Calle 123', 'frenado', 'Carlos Sanchez', 'destination', 'recibes', 1111, 'bundle', 'missing', 'observations', 'asdasdasdasd', ' fewfefwefwfewe', 4),
    (39, 'llamar a tahio', '2021-08-10', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', NULL, '', '', NULL),
    (40, 'llamar a tahio', '2021-08-10', 'Av. Direccion 123', NULL, 'Carlos Sanchez', NULL, NULL, NULL, NULL, '', NULL, '', '', 4),
    (41, 'llamar a tahio', '2021-08-10', 'Blv Calle 123', 'frenado', 'Carlos Sanchez', NULL, NULL, NULL, NULL, '', NULL, 'eresrerser', ' eresrerser', 4),
    (42, 'llamar a tahio', '2021-08-10', NULL, NULL, 'Carlos Sanchez', 'pendiente', NULL, NULL, NULL, '', NULL, '', ' dddddd', 4),
    (43, 'llamar a tahio', '2021-08-10', NULL, NULL, 'Carlos Sanchez', 'pendiente', 'pendiente', NULL, NULL, '', NULL, '', '', 4),
    (44, 'llamar a tahio', '2021-08-10', NULL, NULL, NULL, 'pendiente', 'pendiente', 123456, NULL, '', NULL, '', '', 4),
    (45, 'llamar a tahio', '2021-08-10', NULL, NULL, NULL, 'pendiente', 'pendiente', 123456, NULL, '', '', '', '', 4),
    (46, 'llamar a tahio', '2021-08-10', 'Av. Direccion 123', 'frenado', NULL, '', 'pendiente', 123456, 'null', '', '', '', '', 4),
    (47, 'llamar a tahio', '2021-08-10', NULL, NULL, NULL, 'pendiente', 'pendiente', 123456, NULL, '', '', '', '', 4),
    (48, 'llamar a tahio', '2021-08-10', NULL, NULL, 'pendiente', 'pendiente', 'pendiente', 123456, '', '', '', '', '', 4),
    (49, 'llamar a tahio', '2021-08-10', NULL, NULL, 'pendiente', 'pendiente', 'pendiente', 123456, '', '', '', '', '', 4),
    (50, 'llamar a tahio', '2021-08-10', 'Av. Direccion 123', 'listo', '', '', 'drgdr', 1151651829, 'rdgdg', '', 'drg', '', '', 4);

-- Dumping data for table `orders_seq`
--

INSERT INTO `orders_seq` (`next_val`) VALUES
    (103);