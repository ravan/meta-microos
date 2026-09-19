SUMMARY = "Documentation for Flocq"
DESCRIPTION = "This package contains the HTML documentation for flocq."
LICENSE = "LGPL-3.0-or-later"

PV = "4.2.2"

RPM_NAME = "flocq-doc-4.2.2-1.7.noarch.rpm"
RPM_HASH = "f17de3ae14f45ddf278ec0dc014190d66d73c466bb326dde52340460c8bd64fcb5375797804105844d4451629f3fd134d5484894eb13aab7f379d26c98fd05d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flocq-doc"

RDEPENDS:${PN} += "coq-doc \
flocq \
rocq-stdlib-doc"

inherit rpm
