SUMMARY = "Develop your applications directly in your Kubernetes Cluster"
DESCRIPTION = "Kubernetes has made it very easy to deploy applications to the cloud at a \
higher scale than ever, but the development practices have not evolved at the \
same speed as application deployment patterns.  Today, most developers try to \
either run parts of the infrastructure locally or just test these integrations \
directly in the cluster via CI jobs, or the docker build/redeploy cycle. It \
works, but this workflow is painful and incredibly slow. \
okteto accelerates the development workflow of Kubernetes applications. You \
write your code locally and okteto detects the changes and instantly updates \
your Kubernetes applications."
LICENSE = "Apache-2.0"

PV = "3.22.0"

RPM_NAME = "okteto-3.22.0-1.1.aarch64.rpm"
RPM_HASH = "f80764f10d534d0a81458dcc31501db439be72676f3265c8eb4157e31a7ed4334cdd48142b65628bd43c8de3ef29203078e16206e7961c2afac4a1584f384129"

RPROVIDES:${PN} += "okteto"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
