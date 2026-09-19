SUMMARY = "encoding detection collection for Python"
DESCRIPTION = "A collection of helper functions to detect encodings of text files \
(like HTML, XHTML, XML, CSS, etc.) retrieved via HTTP, file or string. \
 \
:func:`getEncodingInfo` is probably the main function of interest which uses \
other supplied functions itself and gathers all information together and \
supplies an :class:`EncodingInfo` object."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "python314-encutils-1.0.0-1.2.noarch.rpm"
RPM_HASH = "87ff7504648d38ac995c0656fd32996810c0203bd1391bb7b7e6a5637cbb3031f902318d99257aa837cc6b87312ec554d17b096c43e1a7be62644dacf0c5faac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-encutils \
python314-encutils \
python3dist-encutils"

RDEPENDS:${PN} += "python-abi \
python314-chardet"

inherit rpm
