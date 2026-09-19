SUMMARY = "CLI tool for interacting with remote images and registries"
DESCRIPTION = "Useful tips and things you can do with crane and other standard tools. \
 \
List files in an image \
crane export registry.opensuse.org/opensuse/tumbleweed - | tar -tvf - | less \
 \
Export a file from an image \
crane export registry.opensuse.org/opensuse/tumbleweed -  | tar -0xf - etc/passwd \
 \
Diff two configs \
diff -u <(crane config busybox:1.32 | jq) <(crane config busybox:1.33 | jq) \
 \
Diff two manifests \
diff -u <(crane manifest busybox:1.32 | jq) <(crane manifest busybox:1.33 | jq) \
 \
Diff filesystem contents \
diff -u \\ \
   <(crane export gcr.io/kaniko-project/executor:v1.6.0-debug - | tar -tvf - | sort) \\ \
   <(crane export gcr.io/kaniko-project/executor:v1.7.0-debug - | tar -tvf - | sort)"
LICENSE = "Apache-2.0"

PV = "0.22.1"

RPM_NAME = "crane-0.22.1-1.1.aarch64.rpm"
RPM_HASH = "6111ac219964ef1f68552347ce543169a955ba317d01b1f6204a3780bf41b60b065fd5475afaa1cc509019e78d8dd9f67f688df7488ecbf60dbabd14665d1628"

RPROVIDES:${PN} += "crane"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
