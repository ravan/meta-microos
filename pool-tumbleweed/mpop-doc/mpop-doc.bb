SUMMARY = "Documentation for mpop"
DESCRIPTION = "mpop is a small and fast POP3 client. Features include mail filtering, \
delivery to mbox files, maildir folders or a mail delivery agent, a \
very fast POP3 implementation, many authentication methods, good \
TLS/SSL support, IPv6 support, and more. \
 \
 \
This package contains documentation and sample configuration files."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.22"

RPM_NAME = "mpop-doc-1.4.22-1.3.aarch64.rpm"
RPM_HASH = "0bf1ddba17085550fb9bf594d0c84dc2c554e33bca26b3b50cc5af79a777f8193329ade23ea040f22e2bd0768038d32fd7e93964917b3d5b151f5f2eb4a0da55"

RPROVIDES:${PN} += "mpop-doc"

RDEPENDS:${PN} += "mpop"

inherit rpm
