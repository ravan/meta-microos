SUMMARY = "Plymouth 'Spinner' theme"
DESCRIPTION = "This package contains the 'spinner' boot splash theme for \
Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-spinner-22.02.122+94.4bd41a3-20.6.noarch.rpm"
RPM_HASH = "ebdd88ad01b311e691e79e6bca223fc1f1f613287ca0c61c8de4c8900128ee7fcb2320fd464383587b4bb91960e3c43bd754fd27e8a7caf49cae9650516c7ce2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-spinner"

RDEPENDS:${PN} += "plymouth-plugin-two-step \
plymouth-scripts"

inherit rpm
