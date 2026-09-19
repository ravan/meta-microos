SUMMARY = "A toolkit for generation of output for the web - Documentation"
DESCRIPTION = "Genshi is a Python library that provides an integrated set of \
components for parsing, generating, and processing HTML, XML or \
other textual content for output generation on the web. The major \
feature is a template language, which is heavily inspired by Kid. \
 \
This package contains documentation and examples."
LICENSE = "BSD-3-Clause"

PV = "0.7.11"

RPM_NAME = "python-Genshi-doc-0.7.11-2.2.noarch.rpm"
RPM_HASH = "b00b73c07e7b34184512cbe64aa1f6d9fc594c17e9ef95db7730da3521d5bca2eea0f946f1f5d80463e6b84f6dc98277f18f928a2186393add1f32eb30a53929"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Genshi-doc \
python313-Genshi-doc \
python314-Genshi-doc"

RDEPENDS:${PN} += ""

inherit rpm
