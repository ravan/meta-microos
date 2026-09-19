SUMMARY = "A Declarative Dependency Management tool"
DESCRIPTION = "Updatecli is a tool used to apply file update strategies. Designed to be used \
from everywhere, each application 'run' detects if a value needs to be updated \
using a custom strategy then apply changes according to the strategy. \
 \
You describe your update strategy in a file then you run updatecli to it. \
 \
Updatecli reads a yaml or a go template configuration file, then works into \
three stages."
LICENSE = "Apache-2.0"

PV = "0.120.1"

RPM_NAME = "updatecli-0.120.1-1.1.aarch64.rpm"
RPM_HASH = "769f3e212c832463a967d49cb69927e6ab51128dd7a2d4aea5d04feae7a0870af7e18c64f7ad34b86161df718c8a592646b325ccc85b3a0f36a7d4ed77799fb5"

RPROVIDES:${PN} += "updatecli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
