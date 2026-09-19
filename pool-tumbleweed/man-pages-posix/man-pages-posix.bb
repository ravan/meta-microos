SUMMARY = "POSIX Manual Pages"
DESCRIPTION = "A large collection of man pages (reference material) from \
 \
This release contains a copy of the POSIX 1003.1-2017 man pages. \
The directories man0p, man1p, man3p contain descriptions of the \
headers, the utilities, and the functions documented in that standard. \
For the copyright notice, see the file POSIX-COPYRIGHT. \
 \
The man pages are organized into the following sections: \
* 0p: POSIX headers \
* 1p: POSIX utilities \
* 3p: POSIX functions"
LICENSE = "SUSE-IEEE"

PV = "2017a"

RPM_NAME = "man-pages-posix-2017a-2.3.noarch.rpm"
RPM_HASH = "b72bb11ad9db6739461deb6e132fa2709d4011a049f29fa05ecdeda67cbe7978820852f0c9f68ada0e820acb7734ea41d4c69db4883374480b065c05a4586f1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pages-posix"

RDEPENDS:${PN} += ""

inherit rpm
