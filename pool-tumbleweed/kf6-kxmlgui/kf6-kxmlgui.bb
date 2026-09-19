SUMMARY = "Framework for managing menu and toolbar actions"
DESCRIPTION = "libkxmlgui provides a framework for managing menu and toolbar actions in an \
abstract way. The actions are configured through a XML description and hooks \
in the application code. The framework supports merging of multiple \
description for example for integrating actions from plugins."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kxmlgui-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "5143378776be93350f9c166425139579a01355eac150f512a754960b254a3afc0a6784c08a995baa1040180a728240ff69b08f6f9199b6475cd8dc604ceb1612"

RPROVIDES:${PN} += "kf6-kxmlgui"

RDEPENDS:${PN} += ""

inherit rpm
