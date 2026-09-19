SUMMARY = "IBM Plex Sans"
DESCRIPTION = " \
IBM Plex is a typeface superfamily to reflect the design principles \
of IBM and to be used for all brand material across the company \
internationally. \
 \
 \
Plex Sans is a grotesque sans-serif typeface with a design that was \
inspired by Franklin Gothic. Some of Franklin Gothic's features such \
as the angled terminals, a double-storey g and a horizontal line at \
the baseline of the 1 are used."
LICENSE = "OFL-1.1"

PV = "6.4.0"

RPM_NAME = "ibm-plex-sans-fonts-6.4.0-1.4.noarch.rpm"
RPM_HASH = "2c21355b59d0678b0e53b8e36c71dd590b718c91278b17c9adfd2dcfe42abbda816b6d4458f9a09817145bc9a8d1376222f8bd2bae7eab1ebc7db705bb89a8e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibm-plex-sans-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
