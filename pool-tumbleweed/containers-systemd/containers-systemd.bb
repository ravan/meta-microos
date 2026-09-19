SUMMARY = "Systemd service files and config files for openSUSE container"
DESCRIPTION = "This package contains the configuration files and systemd units \
to run the openSUSE containers via podman managed by systemd. \
Currently supported are bind, cups, dhcp-server, dovecot, fetchmail, haproxy, \
mariadb, minidlna, nginx, openldap, postfix, roundcube, samba, \
spamassassin, squid and wsdd. Additional, there is a timer to cleanup \
dangling container images."
LICENSE = "MIT"

PV = "0.0+git20231208.299201e"

RPM_NAME = "containers-systemd-0.0+git20231208.299201e-2.7.noarch.rpm"
RPM_HASH = "dd44bb36caa249713aa3a316158cca37c11b743515f1e073223326424672544428ad451668d34664e6189e36134275cb744200696dbe1cda4a38628a12f59d78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-containers-systemd \
containers-systemd"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
