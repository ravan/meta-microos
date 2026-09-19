SUMMARY = "Utility to add susedata to repomd metadata"
DESCRIPTION = "This utility scans repodata and adds susedata and EULAs where needed."
LICENSE = "GPL-2.0-only"

PV = "0.3.8"

RPM_NAME = "instsource-susedata-0.3.8-1.9.noarch.rpm"
RPM_HASH = "531e6952acb6e987e688437d97756839488ba235f0acf7ceb2303c32a75c14f4e0ba7953f9da50a7ecf24d7efdb9006310f78eaeb2ac35cd660ff97d60682f69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "instsource-susedata"

RDEPENDS:${PN} += "/usr/bin/perl \
inst-source-utils \
package-EULAs \
perl-Locale--gettext \
perl-URI--Escape \
perl-XML--Structured"

inherit rpm
