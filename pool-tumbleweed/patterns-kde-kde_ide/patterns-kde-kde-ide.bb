SUMMARY = "KDE Integrated Development Environment"
DESCRIPTION = "KDE software for development (editors, integrated development environments, and associated tools)."
LICENSE = "MIT"

PV = "20260830"

RPM_NAME = "patterns-kde-kde_ide-20260830-1.1.noarch.rpm"
RPM_HASH = "91cb22de1b517d0f5fdb63dd77a7db4154ea29c3d4ae2447e52c53b1808ff98adb6758c7470da650dd893a1ea62baad16bb1872d07fa809636df64d2f99754a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-kde-kde-ide \
patterns-openSUSE-kde-ide \
patterns-openSUSE-kde4-ide"

RDEPENDS:${PN} += ""

inherit rpm
