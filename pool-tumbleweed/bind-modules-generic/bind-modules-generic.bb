SUMMARY = "DLZ module which store zone data in plain files"
DESCRIPTION = "This package provides the externally loadable filesystem DLZ module, without \
update support and the externally loadable wildcard DLZ module. \
The 'wildcard' DLZ module provides a 'template' zone for domains matching \
a wildcard name. \
For any zone name matching the wildcard, it would return the data from \
the template.  '$zone$' is replaced with zone name: i.e., the shortest \
possible string of labels in the query name that matches the wildcard."
LICENSE = "MPL-2.0"

PV = "9.20.26"

RPM_NAME = "bind-modules-generic-9.20.26-1.2.aarch64.rpm"
RPM_HASH = "77c9d61ec5b2d3aea2d47b2485969c86822bbe499795712cd4cffa14507403f5ef9d79eb4db8bbdeca3446eee9f4b63edb3452c954a711d5ada8b3f4adce78ed"

RPROVIDES:${PN} += "bind-modules-generic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
