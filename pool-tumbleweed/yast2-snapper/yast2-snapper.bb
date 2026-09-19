SUMMARY = "YaST - file system snapshots review"
DESCRIPTION = "YaST module for accessing and managing file-system snapshots"
LICENSE = "GPL-2.0-only"

PV = "5.0.0"

RPM_NAME = "yast2-snapper-5.0.0-1.15.aarch64.rpm"
RPM_HASH = "774346bf17ef9ae3461842b3452d24b15d48af61182197e1060e3f4330425293c61c57919d77e7b616a2c71daa46fc41f240f3d13d991ae96af5a81aedcb68ab"

RPROVIDES:${PN} += "yast2-snapper"

RDEPENDS:${PN} += "rubygem-ruby-4.0.0-ruby-dbus \
snapper \
yast2 \
yast2-ruby-bindings"

inherit rpm
