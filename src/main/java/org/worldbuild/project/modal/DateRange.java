package org.worldbuild.project.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.Date;

@Data
@Log4j2
@AllArgsConstructor
public class DateRange {

    Date from;
    Date to;
}
