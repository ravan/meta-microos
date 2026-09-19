SUMMARY = "Wraps OBS docker/kiwi-built images in rpms"
DESCRIPTION = "OBS container_post_run hook to wrap a kiwi or docker image in an rpm package. \
 \
This package should be required by the Build Service project's meta \
prjconf, so that the container_post_run hook is present in the container image \
and gets executed at the end of the image build.  It will then build \
an rpm which contains the newly-produced image from kiwi/docker (using \
image.spec.in), and place the rpm in the correct location that it \
becomes an additional build artefact."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "containment-rpm-2.0.2-1.9.noarch.rpm"
RPM_HASH = "b4eb057ec832784d50703d73a840c68b56af096cc72678e25741b91db5c6ecb0c7da4554302a11c02dd7f873c94f8ae6463b521592090ed86625c0e8bda822f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "containment-rpm"

RDEPENDS:${PN} += "/usr/bin/bash \
jq \
libxml2-tools"

inherit rpm
