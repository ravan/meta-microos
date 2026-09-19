SUMMARY = "Microsoft Azure bundle"
DESCRIPTION = "This is the Microsoft Azure bundle. \
 \
This package does not contain any code in itself. It installs a set \
of packages that provide Microsoft Azure functionality. \
 \
All packages in this bundle have been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python313-azure-sdk-4.0.0-17.4.noarch.rpm"
RPM_HASH = "40710ce2c64db38bd03d535ba67dc0c756d2aa14e69328432b8d154dd1e865468b36fe390abd093d721dcdceb5703000788490a627457c5dad200b2321353155"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-sdk \
python313-azure-sdk"

RDEPENDS:${PN} += "python313-applicationinsights \
python313-azure-agrifood-farming \
python313-azure-ai-anomalydetector \
python313-azure-ai-contentsafety \
python313-azure-ai-formrecognizer \
python313-azure-ai-language-conversations \
python313-azure-ai-language-questionanswering \
python313-azure-ai-metricsadvisor \
python313-azure-ai-ml \
python313-azure-ai-nspkg \
python313-azure-ai-textanalytics \
python313-azure-ai-translation-document \
python313-azure-ai-translation-text \
python313-azure-appconfiguration \
python313-azure-appconfiguration-provider \
python313-azure-applicationinsights \
python313-azure-batch \
python313-azure-cognitiveservices-anomalydetector \
python313-azure-cognitiveservices-formrecognizer \
python313-azure-cognitiveservices-inkrecognizer \
python313-azure-cognitiveservices-knowledge-nspkg \
python313-azure-cognitiveservices-knowledge-qnamaker \
python313-azure-cognitiveservices-language-luis \
python313-azure-cognitiveservices-language-nspkg \
python313-azure-cognitiveservices-language-spellcheck \
python313-azure-cognitiveservices-language-textanalytics \
python313-azure-cognitiveservices-nspkg \
python313-azure-cognitiveservices-personalizer \
python313-azure-cognitiveservices-search-autosuggest \
python313-azure-cognitiveservices-search-customimagesearch \
python313-azure-cognitiveservices-search-customsearch \
python313-azure-cognitiveservices-search-entitysearch \
python313-azure-cognitiveservices-search-imagesearch \
python313-azure-cognitiveservices-search-newssearch \
python313-azure-cognitiveservices-search-nspkg \
python313-azure-cognitiveservices-search-videosearch \
python313-azure-cognitiveservices-search-visualsearch \
python313-azure-cognitiveservices-search-websearch \
python313-azure-cognitiveservices-vision-computervision \
python313-azure-cognitiveservices-vision-contentmoderator \
python313-azure-cognitiveservices-vision-customvision \
python313-azure-cognitiveservices-vision-face \
python313-azure-cognitiveservices-vision-nspkg \
python313-azure-common \
python313-azure-communication-administration \
python313-azure-communication-callautomation \
python313-azure-communication-chat \
python313-azure-communication-email \
python313-azure-communication-identity \
python313-azure-communication-jobrouter \
python313-azure-communication-messages \
python313-azure-communication-networktraversal \
python313-azure-communication-nspkg \
python313-azure-communication-phonenumbers \
python313-azure-communication-rooms \
python313-azure-communication-sms \
python313-azure-confidentialledger \
python313-azure-containerregistry \
python313-azure-core \
python313-azure-core-experimental \
python313-azure-core-tracing-opencensus \
python313-azure-core-tracing-opentelemetry \
python313-azure-cosmos \
python313-azure-data-nspkg \
python313-azure-data-tables \
python313-azure-datalake-store \
python313-azure-defender-easm \
python313-azure-developer-devcenter \
python313-azure-developer-loadtesting \
python313-azure-devops \
python313-azure-digitaltwins-core \
python313-azure-eventgrid \
python313-azure-eventhub \
python313-azure-eventhub-checkpointstoreblob \
python313-azure-eventhub-checkpointstoreblob-aio \
python313-azure-graphrbac \
python313-azure-health-deidentification \
python313-azure-healthinsights-cancerprofiling \
python313-azure-healthinsights-clinicalmatching \
python313-azure-healthinsights-radiologyinsights \
python313-azure-identity \
python313-azure-identity-broker \
python313-azure-iot-deviceprovisioning \
python313-azure-iot-deviceupdate \
python313-azure-iot-nspkg \
python313-azure-keyvault \
python313-azure-keyvault-administration \
python313-azure-keyvault-certificates \
python313-azure-keyvault-keys \
python313-azure-keyvault-nspkg \
python313-azure-keyvault-secrets \
python313-azure-loganalytics \
python313-azure-maps-geolocation \
python313-azure-maps-render \
python313-azure-maps-route \
python313-azure-maps-timezone \
python313-azure-media-videoanalyzer-edge \
python313-azure-messaging-webpubsubclient \
python313-azure-messaging-webpubsubservice \
python313-azure-mgmt \
python313-azure-mgmt-appcontainers \
python313-azure-mgmt-confidentialledger \
python313-azure-mgmt-dnsresolver \
python313-azure-mgmt-dynatrace \
python313-azure-mgmt-nginx \
python313-azure-mgmt-scvmm \
python313-azure-mgmt-workloads \
python313-azure-mixedreality-authentication \
python313-azure-monitor-ingestion \
python313-azure-monitor-opentelemetry-exporter \
python313-azure-monitor-query \
python313-azure-monitor-querymetrics \
python313-azure-multiapi-storage \
python313-azure-nspkg \
python313-azure-onlineexperimentation \
python313-azure-purview-account \
python313-azure-purview-administration \
python313-azure-purview-catalog \
python313-azure-purview-scanning \
python313-azure-purview-sharing \
python313-azure-schemaregistry \
python313-azure-schemaregistry-avroencoder \
python313-azure-schemaregistry-avroserializer \
python313-azure-search-documents \
python313-azure-search-nspkg \
python313-azure-security-attestation \
python313-azure-servicebus \
python313-azure-servicefabric \
python313-azure-servicemanagement-legacy \
python313-azure-storage-blob \
python313-azure-storage-blob-changefeed \
python313-azure-storage-common \
python313-azure-storage-file \
python313-azure-storage-file-datalake \
python313-azure-storage-file-share \
python313-azure-storage-nspkg \
python313-azure-storage-queue \
python313-azure-synapse-accesscontrol \
python313-azure-synapse-artifacts \
python313-azure-synapse-managedprivateendpoints \
python313-azure-synapse-monitoring \
python313-azure-synapse-nspkg \
python313-azure-synapse-spark \
python313-azure-template \
python313-msal \
python313-msal-extensions \
python313-msrest"

inherit rpm
