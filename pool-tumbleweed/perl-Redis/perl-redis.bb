SUMMARY = "Perl binding for Redis database"
DESCRIPTION = "Pure perl bindings for https://redis.io/ \
 \
This version supports protocol 2.x (multi-bulk) or later of Redis available \
at https://github.com/antirez/redis/. \
 \
This documentation lists commands which are exercised in test suite, but \
additional commands will work correctly since protocol specifies enough \
information to support almost all commands with same piece of code with a \
little help of 'AUTOLOAD'."
LICENSE = "Artistic-2.0"

PV = "2.000"

RPM_NAME = "perl-Redis-2.000-1.17.noarch.rpm"
RPM_HASH = "54243b920ffa2d577ae2f92e22031a231c413fd548418c1b7c4f1ab2b21c40355c49d47a4f099df346d0456d5ce7b815ff0153c5d6291a2c2b6a14f4549dfb02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Redis \
perl-Redis--Hash \
perl-Redis--List \
perl-Redis--Sentinel"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-IO--Socket--Timeout \
perl-Try--Tiny"

inherit rpm
