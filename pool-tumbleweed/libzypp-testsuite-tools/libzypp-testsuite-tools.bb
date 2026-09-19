SUMMARY = "Package, Patch, Pattern, and Product Management - testsuite-tools"
DESCRIPTION = "Package, Patch, Pattern, and Product Management - testsuite-tools \
 \
Authors: \
-------- \
    Michael Andres <ma@suse.de> \
    Jiri Srain <jsrain@suse.cz> \
    Stefan Schubert <schubi@suse.de> \
    Duncan Mac-Vicar <dmacvicar@suse.de> \
    Klaus Kaempf <kkaempf@suse.de> \
    Marius Tomaschewski <mt@suse.de> \
    Stanislav Visnovsky <visnov@suse.cz> \
    Ladislav Slezak <lslezak@suse.cz>"
LICENSE = "GPL-2.0"

PV = "5.0.7"

RPM_NAME = "libzypp-testsuite-tools-5.0.7-1.4.aarch64.rpm"
RPM_HASH = "1d15280256228020bab507a766aaf6286f72da9cc3093cb5cac0334ea95a153c963001bbca2ae687f34e67576f48928cf047d716316365215cb5ba21f8024eb4"

RPROVIDES:${PN} += "libzypp-testsuite-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libzypp.so.1735"

inherit rpm
