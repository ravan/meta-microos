SUMMARY = "Minify your container images without changes"
DESCRIPTION = "Slim helps you build optimized containers, while Root.io automatically fixes \
vulnerabilities without disrupting your workflows. Use Slim's open source \
toolkit to optimize containers, then keep them secure with Root's automated \
vulnerability remediation – from optimization to continuous security in one \
seamless journey."
LICENSE = "Apache-2.0"

PV = "1.40.11"

RPM_NAME = "slim-1.40.11-1.8.aarch64.rpm"
RPM_HASH = "ea5a68b7797fbfa66ae3c5f32eff967c4a72a84875904ea01cf786db89f261fab4f58ebe6a3a4a0964af36272c096b5ff0e26fe444e329703d46915928e10a04"

RPROVIDES:${PN} += "docker-slim \
slim"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
