SUMMARY = "CUPS library configuration files"
DESCRIPTION = "CUPS is a modular printing system which allows a computer to act as a \
print server. \
 \
This subpackage contains some basic configuration files for its \
operation."
LICENSE = "Apache-2.0"

PV = "2.4.19"

RPM_NAME = "cups-config-2.4.19-3.1.aarch64.rpm"
RPM_HASH = "93eca4a7de37ced4d128cb47903b0bab0b2decbe49647b18fd8b44446c187c4afad97ffc6f47186dd112165df69e2460e558ee9684bacf219c9af92f0f368636"

RPROVIDES:${PN} += "config-cups-config \
cups-config"

RDEPENDS:${PN} += "/usr/bin/sh \
group-lp \
user-lp"

inherit rpm
