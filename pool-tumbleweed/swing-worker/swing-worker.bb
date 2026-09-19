SUMMARY = "UI updates support for long running tasks"
DESCRIPTION = "SwingWorker is designed for situations where you need to have a long \
running task run in a background thread and provide updates to the UI \
either when done, or while processing. This project is a backport of \
SwingWorker included into Java 1.6."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2"

RPM_NAME = "swing-worker-1.2-27.9.noarch.rpm"
RPM_HASH = "63cc4c06dd48af7f0e3dd8ea7ae887ca20226c6b8153b15014f31ef91fe3a5e3011bd8a71f50ce6db1322e3f369219c70eeaabf1aa5854958950d54fbc65f5b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swing-worker"

RDEPENDS:${PN} += "java"

inherit rpm
