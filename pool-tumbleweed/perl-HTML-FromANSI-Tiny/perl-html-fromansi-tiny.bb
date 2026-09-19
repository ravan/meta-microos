SUMMARY = "Easily convert colored command line output to HTML"
DESCRIPTION = "Convert the output from a terminal command that is decorated with ANSI \
escape sequences into customizable HTML (with a small amount of code). \
 \
This module complements Parse::ANSIColor::Tiny by providing a simple HTML \
markup around its output. \
 \
Parse::ANSIColor::Tiny returns a data structure that's easy to reformat \
into any desired output. Reformatting to HTML seemed simple and common \
enough to warrant this module as well."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.107.0"

RPM_NAME = "perl-HTML-FromANSI-Tiny-0.107.0-2.12.noarch.rpm"
RPM_HASH = "41513e8831c61874a81a79f3a1e6f5248bf2ca5bdf2123e60e5ff82c150c4168acbc1943f28b2fafc774a74dbf3922451edeca9804459707837c7edbdc1afd8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--FromANSI--Tiny \
perl-HTML-FromANSI-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-HTML--Entities \
perl-Parse--ANSIColor--Tiny"

inherit rpm
