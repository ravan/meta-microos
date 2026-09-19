SUMMARY = "Pure Java implementation of Xgboost predictor for online prediction tasks"
DESCRIPTION = "Pure Java implementation of XGBoost predictor for online prediction tasks."
LICENSE = "Apache-2.0"

PV = "0.3.20"

RPM_NAME = "xgboost-predictor-0.3.20-1.4.noarch.rpm"
RPM_HASH = "dd43c8d3526f5414ca8520be4fddc273a2c655dc9b836c26c4860017fafb41059c06ae145844469ac0c10c491d3419c87bba3da8443ba4a432ee3c77d9f6057d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-ai.h2o-h2o-tree-api \
mvn-ai.h2o-h2o-tree-api-pom- \
mvn-ai.h2o-xgboost-predictor \
mvn-ai.h2o-xgboost-predictor-pom- \
xgboost-predictor"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-net.jafama-jafama"

inherit rpm
