SUMMARY = "A Small Utility for Updating a Dynamic DNS Service"
DESCRIPTION = "ez-ipupdate is a small utility for updating your hostname for any of \
the dynamic DNS services offered at: \
 \
* http://www.ez-ip.net \
 \
* http://www.justlinux.com \
 \
* http://www.dhs.org \
 \
* http://www.dyndns.org \
 \
* http://www.ods.org \
 \
* http://gnudip.cheapnet.net (GNUDip) \
 \
* http://www.dyn.ca (GNUDip) \
 \
* http://www.tzo.com \
 \
* http://www.easydns.com \
 \
* http://www.dyns.cx \
 \
* http://www.hn.org \
 \
* http://www.zoneedit.com \
 \
* http://www.joker.com"
LICENSE = "GPL-2.0+"

PV = "3.0.11b8"

RPM_NAME = "ez-ipupdate-3.0.11b8-293.9.aarch64.rpm"
RPM_HASH = "b38edb3004ae82cdc899fec0f22566389b27f80766b536fa3ab5126f9ea0ca6c8fdf3936c7542a20d316aa2ff242b3c3fe91cad3319d2c271d9b2f8b5f65db6a"

RPROVIDES:${PN} += "config-ez-ipupdate \
ez-ipupdate"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
