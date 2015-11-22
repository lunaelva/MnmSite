package com.mnm.site.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = -164256243;

    public static final QMember member = new QMember("member1");

    public final DateTimePath<java.util.Date> birth = createDateTime("birth", java.util.Date.class);

    public final StringPath email = createString("email");

    public final NumberPath<Integer> gender = createNumber("gender", Integer.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath nickName = createString("nickName");

    public final DateTimePath<java.util.Date> occTime = createDateTime("occTime", java.util.Date.class);

    public final StringPath pwd = createString("pwd");

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public final StringPath userId = createString("userId");

    public final StringPath userName = createString("userName");

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    @SuppressWarnings("all")
    public QMember(Path<? extends Member> path) {
        super((Class)path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata<?> metadata) {
        super(Member.class, metadata);
    }

}

