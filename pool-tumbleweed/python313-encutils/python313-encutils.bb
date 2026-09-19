SUMMARY = "encoding detection collection for Python"
DESCRIPTION = "A collection of helper functions to detect encodings of text files \
(like HTML, XHTML, XML, CSS, etc.) retrieved via HTTP, file or string. \
 \
:func:`getEncodingInfo` is probably the main function of interest which uses \
other supplied functions itself and gathers all information together and \
supplies an :class:`EncodingInfo` object."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "python313-encutils-1.0.0-1.2.noarch.rpm"
RPM_HASH = "0ddede3ac6ca38e80c38f75a641ea8f77dc6d6392c27bc55d3faadf1c86f143df8f8ef7f8316f523301d5c7d4d2ced3a23ef7dc5185b717337c6ad81656e0daa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-encutils \
python3.13dist-encutils \
python313-encutils \
python3dist-encutils"

RDEPENDS:${PN} += "python-abi \
python313-chardet"

inherit rpm
