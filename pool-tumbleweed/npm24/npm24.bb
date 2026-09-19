SUMMARY = "Package manager for Node.js"
DESCRIPTION = "A package manager for Node.js that allows developers to install and \
publish packages to a package registry."
LICENSE = "MIT"

PV = "24.18.1"

RPM_NAME = "npm24-24.18.1-1.1.aarch64.rpm"
RPM_HASH = "6411ea26a9e20842be17bcda82d35742e2d7a48fa039e429780da3192cce65b42616e17b42f61181adf40ae7d5e94aa712ce246be9dea90d630b2899bdf2ec43"

RPROVIDES:${PN} += "bundled-node-abbrev \
bundled-node-agent-base \
bundled-node-aproba \
bundled-node-archy \
bundled-node-balanced-match \
bundled-node-bin-links \
bundled-node-binary-extensions \
bundled-node-brace-expansion \
bundled-node-cacache \
bundled-node-chalk \
bundled-node-chownr \
bundled-node-ci-info \
bundled-node-cidr-regex \
bundled-node-cmd-shim \
bundled-node-common-ancestor-path \
bundled-node-cssesc \
bundled-node-debug \
bundled-node-diff \
bundled-node-env-paths \
bundled-node-exponential-backoff \
bundled-node-fastest-levenshtein \
bundled-node-fdir \
bundled-node-fs-minipass \
bundled-node-glob \
bundled-node-graceful-fs \
bundled-node-hosted-git-info \
bundled-node-http-cache-semantics \
bundled-node-http-proxy-agent \
bundled-node-https-proxy-agent \
bundled-node-iconv-lite \
bundled-node-ignore-walk \
bundled-node-ini \
bundled-node-init-package-json \
bundled-node-ip-address \
bundled-node-is-cidr \
bundled-node-isexe \
bundled-node-json-parse-even-better-errors \
bundled-node-json-stringify-nice \
bundled-node-jsonparse \
bundled-node-just-diff \
bundled-node-just-diff-apply \
bundled-node-libnpmaccess \
bundled-node-libnpmdiff \
bundled-node-libnpmexec \
bundled-node-libnpmfund \
bundled-node-libnpmorg \
bundled-node-libnpmpack \
bundled-node-libnpmpublish \
bundled-node-libnpmsearch \
bundled-node-libnpmteam \
bundled-node-libnpmversion \
bundled-node-lru-cache \
bundled-node-make-fetch-happen \
bundled-node-minimatch \
bundled-node-minipass \
bundled-node-minipass-collect \
bundled-node-minipass-fetch \
bundled-node-minipass-flush \
bundled-node-minipass-pipeline \
bundled-node-minipass-sized \
bundled-node-minizlib \
bundled-node-ms \
bundled-node-mute-stream \
bundled-node-negotiator \
bundled-node-node-gyp \
bundled-node-nopt \
bundled-node-npm-audit-report \
bundled-node-npm-bundled \
bundled-node-npm-install-checks \
bundled-node-npm-normalize-package-bin \
bundled-node-npm-package-arg \
bundled-node-npm-packlist \
bundled-node-npm-pick-manifest \
bundled-node-npm-profile \
bundled-node-npm-registry-fetch \
bundled-node-npm-user-validate \
bundled-node-p-map \
bundled-node-pacote \
bundled-node-parse-conflict-json \
bundled-node-path-scurry \
bundled-node-picomatch \
bundled-node-postcss-selector-parser \
bundled-node-proc-log \
bundled-node-proggy \
bundled-node-promise-all-reject-late \
bundled-node-promise-call-limit \
bundled-node-promzard \
bundled-node-qrcode-terminal \
bundled-node-read \
bundled-node-read-cmd-shim \
bundled-node-safer-buffer \
bundled-node-semver \
bundled-node-signal-exit \
bundled-node-sigstore \
bundled-node-smart-buffer \
bundled-node-socks \
bundled-node-socks-proxy-agent \
bundled-node-spdx-exceptions \
bundled-node-spdx-expression-parse \
bundled-node-spdx-license-ids \
bundled-node-ssri \
bundled-node-supports-color \
bundled-node-tar \
bundled-node-text-table \
bundled-node-tiny-relative-date \
bundled-node-tinyglobby \
bundled-node-treeverse \
bundled-node-tuf-js \
bundled-node-undici \
bundled-node-util-deprecate \
bundled-node-validate-npm-package-name \
bundled-node-walk-up-path \
bundled-node-which \
bundled-node-write-file-atomic \
bundled-node-yallist \
nodejs-npm \
npm \
npm-npm \
npm24"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/node24 \
/usr/bin/sh \
group-nobody \
nodejs-common \
nodejs24 \
user-nobody"

inherit rpm
