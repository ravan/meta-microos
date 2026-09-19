SUMMARY = "The RPM Package Manager"
DESCRIPTION = "RPM Package Manager is the main tool for managing the software packages \
of the SUSE Linux distribution. \
 \
RPM can be used to install and remove software packages. With rpm, it \
is easy to update packages.  RPM keeps track of all these manipulations \
in a central database.	This way it is possible to get an overview of \
all installed packages.  RPM also supports database queries."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.1"

RPM_NAME = "rpm-4.20.1-10.1.aarch64.rpm"
RPM_HASH = "4f2da575cb980e0b59485369c5848876193e69d686ecdafc93a65205bab34fdef59ecdca5c2bf1b65b66a84ec09cc628f74074fa4b5489ba7c4149f9667e8b03"

RPROVIDES:${PN} += "librpm.so.10 \
librpmio.so.10 \
librpmsign.so.10 \
rpm \
rpm-flushes-runposttrans \
rpminst"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libbz2.so.1 \
libc.so.6 \
libcap.so.2 \
libgcrypt.so.20 \
liblua5.4.so.5 \
liblzma.so.5 \
libpopt.so.0 \
libselinux.so.1 \
libz.so.1 \
libzstd.so.1 \
rpm-config-SUSE"

inherit rpm
