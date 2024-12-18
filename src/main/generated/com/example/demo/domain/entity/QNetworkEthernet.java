package com.example.demo.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QNetworkEthernet is a Querydsl query type for NetworkEthernet
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNetworkEthernet extends EntityPathBase<NetworkEthernet> {

    private static final long serialVersionUID = 1986497322L;

    public static final QNetworkEthernet networkEthernet = new QNetworkEthernet("networkEthernet");

    public final StringPath cid = createString("cid");

    public final StringPath desc = createString("desc");

    public final StringPath duplex = createString("duplex");

    public final BooleanPath enable = createBoolean("enable");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath ipv4 = createString("ipv4");

    public final StringPath ipv6 = createString("ipv6");

    public final StringPath mode = createString("mode");

    public final NumberPath<Integer> mss = createNumber("mss", Integer.class);

    public final NumberPath<Integer> mtu = createNumber("mtu", Integer.class);

    public final BooleanPath multipath = createBoolean("multipath");

    public final StringPath name = createString("name");

    public final StringPath speed = createString("speed");

    public final StringPath zone = createString("zone");

    public QNetworkEthernet(String variable) {
        super(NetworkEthernet.class, forVariable(variable));
    }

    public QNetworkEthernet(Path<? extends NetworkEthernet> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNetworkEthernet(PathMetadata metadata) {
        super(NetworkEthernet.class, metadata);
    }

}

