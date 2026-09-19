SUMMARY = "Python libraries mandatory for XML-XCB Development"
DESCRIPTION = "Language-independent Python libraries that used to parse an XML description \
and create objects used by Python code generators in individual language \
bindings."
LICENSE = "X11"

PV = "7.6_1.17.0"

RPM_NAME = "python3-xcb-proto-devel-7.6_1.17.0-1.8.aarch64.rpm"
RPM_HASH = "dbd7ce97e647d6a9462139bda8d2b783cc05821eea4dd060827da66c91197f4f0a93634e12152070ee560ccda3359a18ef79bdeea1c51f0d6e87c018f59eb9f3"

RPROVIDES:${PN} += "python3-xcb-proto-devel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
