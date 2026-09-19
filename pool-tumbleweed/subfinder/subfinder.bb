SUMMARY = "Fast passive subdomain enumeration tool"
DESCRIPTION = "subfinder is a subdomain discovery tool that returns valid subdomains for \
websites, using passive online sources.  It has a simple, modular architecture \
and is optimized for speed. \
subfinder is built for doing one thing only - passive subdomain enumeration, \
and it does that very well.  We have made it to comply with all the used \
passive source licenses and usage restrictions. \
The passive model guarantees speed and stealthiness that can be leveraged by \
both penetration testers and bug bounty hunters alike."
LICENSE = "MIT"

PV = "2.13.0"

RPM_NAME = "subfinder-2.13.0-1.5.aarch64.rpm"
RPM_HASH = "2c8970a79c6d21424f81583e06b1686be45ff25d6a9b8df2ef73b3df76cec9833d3aaecdddc71d6a3d40720f6d587638612b4ddb70777324642f2fd0ed9abb0f"

RPROVIDES:${PN} += "subfinder"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
