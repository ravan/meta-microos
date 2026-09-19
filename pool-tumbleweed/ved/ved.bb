SUMMARY = "The Visual Editor"
DESCRIPTION = "Ved (visual editor) is a screen-oriented editor that implements a \
user interface somewhere between vi and emacs. It has almost no \
limitations on file size and supports to edit large files (files >2 \
GB)."
LICENSE = "CDDL-1.0"

PV = "1.8"

RPM_NAME = "ved-1.8-53.5.aarch64.rpm"
RPM_HASH = "5619cddc81c95dda5da1fd2236372e738c5587cc94f6d39aca173667afe173b807698d53102dfdf18d5af81de8cdfd84d81721ecc70100a03fc3e5bacd610b33"

RPROVIDES:${PN} += "ved"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libschily.so.2.0 \
libxtermcap.so.1.0"

inherit rpm
