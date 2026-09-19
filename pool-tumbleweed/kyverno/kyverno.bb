SUMMARY = "CLI and kubectl plugin for Kyverno"
DESCRIPTION = "Kyverno is a policy engine designed for Kubernetes. It can validate, mutate, \
and generate configurations using admission controls and background scans. \
Kyverno policies are Kubernetes resources and do not require learning a new \
language. Kyverno is designed to work nicely with tools you already use like \
kubectl, kustomize, and Git."
LICENSE = "Apache-2.0"

PV = "1.19.0"

RPM_NAME = "kyverno-1.19.0-1.1.aarch64.rpm"
RPM_HASH = "aa7b5fa69628e51c264d23ee375d825b833a15a8edae02c809173f5793467a98cafded8f8bee8a32627f245f7a4df83487c50063ec58fcea731edcd8144142b0"

RPROVIDES:${PN} += "kyverno"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
