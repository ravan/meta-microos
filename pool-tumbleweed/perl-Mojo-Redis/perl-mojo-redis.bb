SUMMARY = "Redis driver based on Mojo::IOLoop"
DESCRIPTION = "Mojo::Redis is a Redis driver that use the Mojo::IOLoop, which makes it \
integrate easily with the Mojolicious framework. \
 \
It tries to mimic the same interface as Mojo::Pg, Mojo::mysql and \
Mojo::SQLite, but the methods for talking to the database vary. \
 \
This module is in no way compatible with the 1.xx version of 'Mojo::Redis' \
and this version also tries to fix a lot of the confusing methods in \
'Mojo::Redis2' related to pubsub. \
 \
This module is currently EXPERIMENTAL, and bad design decisions will be \
fixed without warning. Please report at \
https://github.com/jhthorsen/mojo-redis/issues if you find this module \
useful, annoying or if you simply find bugs. Feedback can also be sent to \
'jhthorsen@cpan.org'."
LICENSE = "Artistic-2.0"

PV = "3.310.0"

RPM_NAME = "perl-Mojo-Redis-3.310.0-1.3.noarch.rpm"
RPM_HASH = "81232f5998eb945fb83c353a427136b0780d63efc8c49cb128c8584597c81fbce5473fe81890afae4ff481719996bef58e27d2a66fb4d38fd3e5ff308844d5f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--Redis \
perl-Mojo--Redis--Cache \
perl-Mojo--Redis--Connection \
perl-Mojo--Redis--Connection--Offline \
perl-Mojo--Redis--Cursor \
perl-Mojo--Redis--Database \
perl-Mojo--Redis--PubSub \
perl-Mojo-Redis"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Mojolicious \
perl-Protocol--Redis--Faster"

inherit rpm
