SUMMARY = "UI updates support for long running tasks"
DESCRIPTION = "SwingWorker is designed for situations where you need to have a long \
running task run in a background thread and provide updates to the UI \
either when done, or while processing. This project is a backport of \
SwingWorker included into Java 1.6."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2"

RPM_NAME = "swing-worker-javadoc-1.2-27.9.noarch.rpm"
RPM_HASH = "b35afd7f48e84a5134603a3c6a85d462b0c397d1b47fcfd3682d68e1b3ff96c7f780666bbf56a84017b56ab5f865802bc6467e6afb378d44f35820d44a198bde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swing-worker-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
