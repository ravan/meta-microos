SUMMARY = "Text Progressbar Library for Python"
DESCRIPTION = "This library provides a text mode progressbar. This is tipically used to \
display the progress of a long running operation, providing a visual clue that \
processing is underway."
LICENSE = "BSD-3-Clause | LGPL-2.1-or-later"

PV = "2.5"

RPM_NAME = "python314-progressbar-2.5-4.5.noarch.rpm"
RPM_HASH = "68e7be53298bce4b1d6dc15d8b6a7f78819d753bcdbff0bdadd1ebc1844d1ae96fe28a0c0145aa5e5eb83457284933e145d6b6c518417960da38f1bbc575dff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-progressbar \
python314-progressbar \
python3dist-progressbar"

RDEPENDS:${PN} += "python-abi"

inherit rpm
