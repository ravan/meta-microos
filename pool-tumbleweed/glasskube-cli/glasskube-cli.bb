SUMMARY = "The next generation Package Manager for Kubernetes"
DESCRIPTION = "Glasskube is an Open Source package manager for Kubernetes. It makes deploying, \
updating, and configuring packages on Kubernetes 20 times faster than tools \
like Helm or Kustomize. Inspired by the simplicity of Homebrew and npm. You can \
decide if you want to use the Glasskube UI, CLI, or directly deploy packages \
via GitOps."
LICENSE = "Apache-2.0"

PV = "0.26.1"

RPM_NAME = "glasskube-cli-0.26.1-1.10.aarch64.rpm"
RPM_HASH = "7dea83273cba5388e4daedcf81d898ea4b0cf7e3d1ac9cc016db14c6ebdc480b25daa4ef4aaaae49a4b9b27d59fb8474324aceb821b164d84ee144ae9e869dd7"

RPROVIDES:${PN} += "glasskube \
glasskube-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
