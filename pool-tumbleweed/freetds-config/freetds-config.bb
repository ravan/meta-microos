SUMMARY = "A free re-implementation of the TDS (Tabular Data Stream) protocol"
DESCRIPTION = "FreeTDS is a project to document and implement the TDS (Tabular Data Stream) \
protocol. TDS is used by Sybase and Microsoft for client to database server \
communications. \
 \
This subpackage contains default configuration files and documentation for \
them."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.27"

RPM_NAME = "freetds-config-1.4.27-2.1.aarch64.rpm"
RPM_HASH = "3836630f95848e5bcbd4cbdf23d15910aca25e9493b2ec46189673d6f22f4660c460553821553dd479aac48111ab3ab309d7a5e4d71fa7748452582eddf32a55"

RPROVIDES:${PN} += "config-freetds-config \
freetds \
freetds-config \
libfreetds"

RDEPENDS:${PN} += ""

inherit rpm
