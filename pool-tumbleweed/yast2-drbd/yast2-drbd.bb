SUMMARY = "YaST2 - DRBD Configuration"
DESCRIPTION = "YaST2 - Configuration of Distributed Replicated Block Devices. With \
this module you can configure a distributed storage system, frequently \
used on high availability (HA) clusters."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.1"

RPM_NAME = "yast2-drbd-5.0.1-1.2.aarch64.rpm"
RPM_HASH = "dd2287d41075cdbdad89232ea6dc065672bc689c8151ea763621a77f3a56cae076b620fc56bc69fc1cd37f49d1b68dcde093bccfb89372fd9b3a504ec37e76be"

RPROVIDES:${PN} += "yast2-drbd"

RDEPENDS:${PN} += "/usr/bin/ruby \
/usr/bin/sh \
drbd \
yast2 \
yast2-ruby-bindings"

inherit rpm
