SUMMARY = "Python library to show simple dialogs"
DESCRIPTION = "Dialite is a pure Python package to show dialogs. It provides a \
handful of functions, each a verb, that can be used to inform(), \
warn() or fail() the user, or to ask_ok(), ask_retry() or \
ask_yesno(). \
 \
Dialite can show graphical dialogs, and falls back to a terminal \
interface if dialogs are unavailable (e.g. if not supported by the \
platform, or for SSH connections)."
LICENSE = "BSD-2-Clause"

PV = "0.6.0"

RPM_NAME = "python313-dialite-0.6.0-1.7.noarch.rpm"
RPM_HASH = "748a338722d7544fe332fdc0f4970ead830cd0ecce0eabcb718478cfbed059b3ec27ffda139557d21bac38ebaad42c6404854016703edf2ab7aafdb735d4c641"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dialite \
python3.13dist-dialite \
python313-dialite \
python3dist-dialite"

RDEPENDS:${PN} += "python-abi"

inherit rpm
