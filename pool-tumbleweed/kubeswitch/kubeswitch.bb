SUMMARY = "Single pane of glass for all of your kubeconfig files"
DESCRIPTION = "kubeswitch (lazy: switch) is the single pane of glass for all of your \
kubeconfig files. \
Caters to operators of large scale Kubernetes installations. \
Designed as a drop-in replacement for kubectx."
LICENSE = "Apache-2.0"

PV = "0.9.3"

RPM_NAME = "kubeswitch-0.9.3-1.10.aarch64.rpm"
RPM_HASH = "2939e64e0e9ddae521d7e4d7d9fa736f5d0e6596a28611aece47776532be44eb05cbb1e0d0e912d8b9001a9db1c424b825c4d5e884fd73020a33ed8bd9d522d0"

RPROVIDES:${PN} += "kubeswitch"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
