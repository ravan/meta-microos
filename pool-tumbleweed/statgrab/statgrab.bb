SUMMARY = "Portable System Statistics Tools"
DESCRIPTION = "This package includes a couple of useful tools that use the libstatgrab library. \
- statgrab: gives a sysctl-style interface to the statistics gathered by libstatgrab \
This extends the use of libstatgrab to people writing scripts or anything else \
that can't easily make C function calls. \
Included with this package is a script to generate an MRTG configuration file \
to use statgrab."
LICENSE = "GPL-2.0-or-later"

PV = "0.92.1"

RPM_NAME = "statgrab-0.92.1-2.1.aarch64.rpm"
RPM_HASH = "3d09027db43c69e24499058d29dec5cc786950cfc3b5c4be8147b3ba774514e3ec2544f343f5fad5b45c9f56c9c7b3387dc22d62ad2d9f02d13de0cd90696470"

RPROVIDES:${PN} += "statgrab"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstatgrab.so.10 \
libstatgrab10"

inherit rpm
