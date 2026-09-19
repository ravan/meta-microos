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

RPM_NAME = "python314-python-memcached-1.62-2.5.noarch.rpm"
RPM_HASH = "98c2bca3239ecfffa6e41f86c87998b2cc746bd1107ad57ea34aacda6ad312798794ca433619b06d8d120eaf4f7923ee0e205c511def69885ba5e9f3cb6474ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-memcached \
python314-python-memcached \
python3dist-python-memcached"

RDEPENDS:${PN} += "memcached \
python-abi"

inherit rpm
