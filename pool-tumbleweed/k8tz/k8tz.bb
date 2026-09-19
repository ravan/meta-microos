SUMMARY = "CLI tool to inject timezones into Kubernetes Pods and CronJobs"
DESCRIPTION = "k8tz is a kubernetes admission controller and a CLI tool to inject timezones \
into Pods and CronJobs. \
 \
Containers do not inherit timezones from host machines and have only accessed \
to the clock from the kernel. The default timezone for most images is UTC, yet \
it is not guaranteed and may be different from container to container. With \
k8tz it is easy to standardize selected timezone across pods and namespaces \
automatically with minimal effort."
LICENSE = "Apache-2.0"

PV = "0.20.0"

RPM_NAME = "k8tz-0.20.0-1.2.aarch64.rpm"
RPM_HASH = "d4f22885746e1c7306ebc2cb6bcc4fa56e5dcbc99702aa22b49140dde96972da389c264341aeaa1ae4eeee2a2f6b8d8cfd7155bc2fd5e7442b3a478734f6ce25"

RPROVIDES:${PN} += "k8tz"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
