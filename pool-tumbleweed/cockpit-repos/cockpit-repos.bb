SUMMARY = "A Cockpit module for managing system repositories"
DESCRIPTION = "A Cockpit module for managing system repositories"
LICENSE = "LGPL-2.1-or-later"

PV = "4.9"

RPM_NAME = "cockpit-repos-4.9-1.1.noarch.rpm"
RPM_HASH = "0034034544ccc897de9ae89966e25c71743ba718714ba92e022e55d2740474610fd607317da760f07d83c63baa7c7c60ab4f720c9bf3df4252d49d4cca5a12ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bundled-npm(@patternfly/patternfly) \
bundled-npm(@patternfly/react-core) \
bundled-npm(@patternfly/react-icons) \
bundled-npm(@patternfly/react-styles) \
bundled-npm(@patternfly/react-table) \
bundled-npm(@patternfly/react-tokens) \
bundled-npm(attr-accept) \
bundled-npm(file-selector) \
bundled-npm(focus-trap) \
bundled-npm(js-tokens) \
bundled-npm(lodash) \
bundled-npm(loose-envify) \
bundled-npm(object-assign) \
bundled-npm(prop-types) \
bundled-npm(react) \
bundled-npm(react-dom) \
bundled-npm(react-dropzone) \
bundled-npm(react-is) \
bundled-npm(scheduler) \
bundled-npm(tabbable) \
bundled-npm(tslib) \
cockpit-repos"

RDEPENDS:${PN} += "cockpit-bridge"

inherit rpm
