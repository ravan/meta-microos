SUMMARY = "Kubectl plugin to render watch output in a more readable fashion"
DESCRIPTION = "A kubectl plugin to render the kubectl get pods --watch output in a much more \
readable fashion. \
 \
Think of it as running watch kubectl get pods, but instead of polling, it uses \
the regular watch feature to stream updates as soon as they occur."
LICENSE = "Apache-2.0 & GPL-3.0-or-later & CC-BY-4.0 & CC0-1.0"

PV = "0.9.2"

RPM_NAME = "kubectl-klock-0.9.2-1.1.aarch64.rpm"
RPM_HASH = "49f28b94b1bcb2b47f93458fee77b9a146a7b0a70136e00875f20c72b9fa5049e6d3dacda6023a2cf5839fc0ba65c12d05c62b9745fd34acfd0aa4086a1a2f7d"

RPROVIDES:${PN} += "kubectl-klock"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
