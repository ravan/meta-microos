SUMMARY = "UI updates support for long running tasks"
DESCRIPTION = "SwingWorker is designed for situations where you need to have a long \
running task run in a background thread and provide updates to the UI \
either when done, or while processing. This project is a backport of \
SwingWorker included into Java 1.6."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2"

RPM_NAME = "swing-worker-demo-1.2-27.9.noarch.rpm"
RPM_HASH = "57db68f79b5d91dab15d14efac17cf668845455024ed6710a18b119e146d6bbbe7c3873608ab31cad9c677f9c7d495251d5d68405fbcc11c012a265a51f8a8af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swing-worker-demo"

RDEPENDS:${PN} += "swing-worker"

inherit rpm
