SUMMARY = "MariaDB RPM macros"
DESCRIPTION = "Provides macros usable in rpm spec files."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "12.3.2"

RPM_NAME = "mariadb-rpm-macros-12.3.2-1.3.aarch64.rpm"
RPM_HASH = "3b7858dbf0626d601c3568af770d175e759b8573f403ca18c7971d1e00cf26aa9972812563e428928b068a1da759754b1b6f3be4dd2f1560b40d992c75d2302d"

RPROVIDES:${PN} += "mariadb-rpm-macros \
rpm-macro-mysql-testserver-cconf \
rpm-macro-mysql-testserver-start \
rpm-macro-mysql-testserver-stop"

RDEPENDS:${PN} += "mariadb"

inherit rpm
