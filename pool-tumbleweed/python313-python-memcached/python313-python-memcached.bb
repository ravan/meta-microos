SUMMARY = "Pure python memcached client"
DESCRIPTION = "This package was originally written by Evan Martin of Danga. \
Sean Reifschneider of tummy.com, ltd. has taken over maintenance of it. \
 \
This software is a 100% Python interface to the memcached memory cache \
daemon.  It is the client side software which allows storing values in one \
or more, possibly remote, memcached servers.  Search google for memcached \
for more information."
LICENSE = "Python-2.0"

PV = "1.62"

RPM_NAME = "python313-python-memcached-1.62-2.5.noarch.rpm"
RPM_HASH = "5cba91ebe8ace2e52be55e62d5526c416f63a2afec59c061fe588eb97aa8164995a652b0708ed547601d8d83b190ea66876a6195b90aed3f4faae8432d076723"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-memcached \
python3.13dist-python-memcached \
python313-python-memcached \
python3dist-python-memcached"

RDEPENDS:${PN} += "memcached \
python-abi"

inherit rpm
