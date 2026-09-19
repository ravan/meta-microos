SUMMARY = "Cockpit Snapshots module for interacting with Snapper snapshots"
DESCRIPTION = "Cockpit Snapshots module for interacting with Snapper snapshots"
LICENSE = "LGPL-2.1-or-later"

PV = "3.1"

RPM_NAME = "cockpit-snapshots-3.1-2.3.noarch.rpm"
RPM_HASH = "846bd3379e08eae6469067d112faefa414f20cee47da9761c2db0512224eb85ec1724589bf1e186585533a15d9800379965422ccaa77f67a3d246e19895c169a"
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
cockpit-snapshots"

RDEPENDS:${PN} += "cockpit-bridge"

inherit rpm
