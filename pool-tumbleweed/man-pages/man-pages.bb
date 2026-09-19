SUMMARY = "Linux Manual Pages"
DESCRIPTION = "A large collection of man pages (documentation) from the Linux \
Documentation Project (LDP).  The man pages are organized into the \
following sections: Section 1, user commands (intro only); Section 2, \
system calls; Section 3, libc calls; Section 4, devices (e.g., hd, sd); \
Section 5, file formats and protocols (e.g., wtmp, /etc/passwd, nfs); \
Section 6, games (intro only); Section 7, conventions, macro packages, \
etc. (e.g., nroff, ascii); and Section 8, system administration (intro \
only)."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "6.19"

RPM_NAME = "man-pages-6.19-1.1.noarch.rpm"
RPM_HASH = "ea983f72a05cd8510f47029b9a70f96aebfe7f4c3487aa6e64f6412dd2e54d6294ab54a0c766948c4f187fdebd9a769cdf3b32844cf4c33ee93f0db9411317a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pages"

RDEPENDS:${PN} += ""

inherit rpm
