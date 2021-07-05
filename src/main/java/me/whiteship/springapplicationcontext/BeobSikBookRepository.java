package me.whiteship.springapplicationcontext;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public class BeobSikBookRepository implements BookRepository{
}
