package com.iyg.bankingclan.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class MainAccount {

  private List<Bank> banks = new ArrayList<>();


}
