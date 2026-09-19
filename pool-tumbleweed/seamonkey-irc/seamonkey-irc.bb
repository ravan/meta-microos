SUMMARY = "IRC for SeaMonkey"
DESCRIPTION = "An IRC client (Chatzilla) for SeaMonkey."
LICENSE = "MPL-2.0"

PV = "2.53.17.1"

RPM_NAME = "seamonkey-irc-2.53.17.1-4.1.aarch64.rpm"
RPM_HASH = "ac3f87bb58452c1eb586de1175c541a75f614b939fac8f905ea818861a145cdd0682381e15e55485b8e94cf0b72dc693a7f67d5a1a76808c7133f5a72dfd3de3"

RPROVIDES:${PN} += "seamonkey-irc"

RDEPENDS:${PN} += "seamonkey"

inherit rpm
